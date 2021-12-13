package com.lgd.utils;

import java.util.UUID;

@SuppressWarnings("all")
public class IdUtils {
    public static String getId() {
        return UUID.randomUUID().toString().replace("-","");
    }
}
