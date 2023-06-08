package com.yani.designpatterns.structural.proxy;

import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterServiceImpl implements TwitterService {
    private static final String TWITTER_CONSUMER_KEY = "rgoFwyryEnuJkNfCtlcVTWWRd";
    private static final String TWITTER_SECRET_KEY = "i74nekoCTxfGwKUwEZ1BNLktOfTBfw42d4pg6KSmSoihtW9O3b";
    private static final String TWITTER_ACCESS_TOKEN = "1371505818-ZU43CE9jlMSgqYnb17GSW1snBo9AhgHPzVw4oJn";
    private static final String TWITTER_ACCESS_TOKEN_SECRET = "8mATfxXsAUojNQrT99OFl0CK23NS3aGofUt49bINfUPyR";

    @Override
    public String getTimeline(String screenName) {
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();

        configurationBuilder.setDebugEnabled(true)
                .setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
                .setOAuthConsumerSecret(TWITTER_SECRET_KEY)
                .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);

        TwitterFactory twitterFactory = new TwitterFactory(configurationBuilder.build());
        Twitter twitter = twitterFactory.getInstance();
        StringBuilder builder = new StringBuilder();

        try {
            Query query = new Query(screenName);
            QueryResult result;

            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();

                for (Status tweet : tweets) {
                    builder.append("@")
                           .append(tweet.getUser().getScreenName())
                           .append(" - ")
                           .append(tweet.getText())
                           .append("\n");
                }
            } while ((query = result.nextQuery()) != null);
        } catch (TwitterException e) {
            e.printStackTrace();
            System.out.println("Failed to search tweets: " + e.getMessage());
        }

        return builder.toString();
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        // we aren't going to allow this
        System.out.println(message);
    }
}
