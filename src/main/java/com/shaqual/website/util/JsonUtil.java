package com.shaqual.website.util;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * 处理JSON的工具类
 */
public class JsonUtil {
    /**
     * 将对象转换为JSON字符串
     * @param state
     * @param msg
     * @param o
     * @return
     */
    public static String turnToJson(Boolean state, String msg, Object o) {
        JSONObject obj = new JSONObject();
        obj.put("state", state);
        obj.put("msg", msg);
        if (o instanceof List) {
            o = toJsonArray((List) o);
        } else if (o instanceof Map) {
            o = toJsonObject((Map) o);
        } else if (o != null) {
            o = o.toString();
        } else {
            o = "";
        }
        obj.put("result", o);
        String result = obj.toString();
        return result;
    }

    public static JSONObject toJsonObject(Map map) {
        JsonConfig config = new JsonConfig();
        config.registerJsonValueProcessor(Timestamp.class, new TimestampProcessor("yyyy-MM-dd HH:mm:ss"));
        JSONObject resJson = JSONObject.fromObject(map, config);
        return resJson;
    }

    public static JSONArray toJsonArray(List list) {
        JsonConfig config = new JsonConfig();
        config.registerJsonValueProcessor(Timestamp.class, new TimestampProcessor("yyyy-MM-dd HH:mm:ss"));
        JSONArray resJson = JSONArray.fromObject(list, config);
        return resJson;
    }
}
