package com.yani.designpatterns.structural.bridge.movie;

import java.util.List;

public class HtmlFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();

        builder.append("<table>\n");
        builder.append("\t<th>\n");
        builder.append("\t\tClassification\n");
        builder.append("\t</th>\n");
        builder.append("\t<th>\n");
        builder.append("\t\t" + header + "\n");
        builder.append("\t</th>\n");

        for (Detail detail : details) {
            builder.append("\t<tr>\n\t\t<td>\n");
            builder.append("\t\t\t" + detail.getLabel() + "\n");
            builder.append("\t\t</td>\n\t\t<td>\n");
            builder.append("\t\t\t" + detail.getValue() + "\n");
            builder.append("\t\t</td>\n\t</tr>\n");
        }

        builder.append("</table>");

        return builder.toString();
    }
}
