package com.yani.designpatterns.creational.builder;

public class LunchOrder {
    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() {

        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;

            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;

            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;

            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;

            return this;
        }
    }

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    private LunchOrder(Builder builder) {
        bread = builder.bread;
        condiments = builder.condiments;
        dressing = builder.dressing;
        meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
