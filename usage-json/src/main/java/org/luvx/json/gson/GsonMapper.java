package org.luvx.json.gson;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.luvx.json.base.BaseJsonMapper;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @author: Ren, Xie
 */
public class GsonMapper extends BaseJsonMapper {
    @Override
    public Map toMap(String json) {
        TypeToken<Map<Object, Object>> typeToken = new TypeToken<Map<Object, Object>>() {
        };
        return gson.fromJson(json, typeToken.getType());
    }

    @Override
    public List toList(String json) {
        TypeToken<List<Object>> typeToken = new TypeToken<List<Object>>() {
        };
        return gson.fromJson(json, typeToken.getType());
    }

    @Override
    public <T> List<T> toList(String json, Type type) {
        return gson.fromJson(json, type);
    }

    @Override
    public String toJsonString(Object o) {
        return gson.toJson(o);
    }

    @Override
    public String toJsonWithDateFormat(Object o, String dateFormatPattern) {
        gson = new GsonBuilder().setDateFormat(dateFormatPattern).create();
        return gson.toJson(o);
    }

    @Override
    public <T> T toPojo(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }

    @Override
    public Map convertToMap(Object o) {
        TypeToken<Map<Object, Object>> typeToken = new TypeToken<Map<Object, Object>>() {
        };
        String json = gson.toJson(o);
        return gson.fromJson(json, typeToken.getType());
    }

    @Override
    public <T> T convertFromMap(Map map, Class<T> clazz) {
        String json = gson.toJson(map);
        return gson.fromJson(json, clazz);
    }
}
