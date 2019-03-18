package com.test;

import org.apache.commons.lang.StringUtils;

public class StringUtilImpl {
    public static final StringUtilImpl INSTANCE = new StringUtilImpl();

    public static StringUtilImpl getInstance() { return INSTANCE; }

    public final boolean isEmpty(String str) {
        return StringUtils.isEmpty(str);
    }
}
