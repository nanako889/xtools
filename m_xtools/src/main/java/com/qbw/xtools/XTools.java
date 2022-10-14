package com.qbw.xtools;

import android.text.TextUtils;

import java.util.Locale;

/**
 * @author QBW
 * @date 10/12/21
 */
public class XTools {
    /**
     * 1234567890 -> 123****8901
     */
    public static String replaceChar(String text, int headerLength, int placeholderLength,
                                     char placeholder) {
        if (TextUtils.isEmpty(text)) {
            return text;
        }
        if (text.length() >= placeholderLength) {
            int end = headerLength + 4;
            char[] pc = text.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if (i >= headerLength && i < end) {
                    sb.append(placeholder);
                } else {
                    sb.append(pc[i]);
                }
            }
            return sb.toString();
        }
        return text;
    }

    /**
     * 将秒转化为小时分钟秒
     */
    public static int[] getHourMinuteSecond(int seconds) {
        int hourSeconds = 3600;
        int h = seconds / hourSeconds;
        int m = (seconds - h * hourSeconds) / 60;
        int s = seconds % 60;
        return new int[]{h, m, s};
    }

    public static String getHourMinuteSecondVideoDuration(int seconds) {
        int[] hms = getHourMinuteSecond(seconds);
        if (hms[0] > 0) {
            return String.format(Locale.getDefault(), "%02d:%02d:%02d", hms[0], hms[1], hms[2]);
        }
        return String.format(Locale.getDefault(), "%02d:%02d", hms[1], hms[2]);
    }

    public static boolean isFirstRow(int pos, int rowColumnCount) {
        return pos >= 0 && pos < rowColumnCount;
    }

    public static boolean isLastRow(int pos, int rowColumnCount, int totalCount) {
        int row = totalCount / rowColumnCount;
        if (totalCount % rowColumnCount == 0) {
            return pos >= (row - 1) * rowColumnCount && pos < totalCount;
        }
        return pos >= row * rowColumnCount && pos < totalCount;
    }
}
