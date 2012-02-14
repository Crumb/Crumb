package com.crumbdev.crumb;

import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Locale;
import java.util.Map;

public class i18n {

    private static Map map;
    private static String locale;

    public static void i18nInit()
    {
        Yaml yaml = new Yaml();
        locale = Locale.getDefault().getISO3Language();
        InputStream inputStream = (new i18n()).getClass().getResourceAsStream("/localization.yml");
        Reader reader = new BufferedReader(new InputStreamReader(inputStream));
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        try{
            int n;
            while ((n = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.exit(1);
        } finally {
            try {
            inputStream.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
                System.exit(1);
            }
        }


        map = (Map) yaml.load(writer.toString());

        if(((Map) map.get("locales")).get(locale) == null)
        {
            System.out.println("This program has not been translated to your language.\n" +
                               "If you wish to translate this program, please go to\n" +
                               "http://wiki.crumbdev.com/index.php/Crumb:   Translation\n" +
                               "Your locale code is: " + locale + "\n" +
                               "Launching the program in English instead.");
            locale = "eng";
        }

    }



    public static String getString(String key)
    {
        return (String) getObject(key);
    }

    public static String getString(String key, String key2)
    {
        return (String) getObject(key, key2);
    }

    public static String getString(String key, String key2, String key3)
    {
        return (String) getObject(key, key2, key3);
    }

    public static String getString(String key, String key2, String key3, String key4)
    {
        return (String) getObject(key, key2, key3, key4);
    }


    public static Integer getInteger(String key)
    {
        return (Integer) getObject(key);
    }

    public static Integer getInteger(String key, String key2)
    {
        return (Integer) getObject(key, key2);
    }

    public static Integer getInteger(String key, String key2, String key3)
    {
        return (Integer) getObject(key, key2, key3);
    }

    public static Integer getInteger(String key, String key2, String key3, String key4)
    {
        return (Integer) getObject(key, key2, key3, key4);
    }



    public static Object getObject(String key)
    {
        if(((Map)((Map) map.get("locales")).get(locale)).get(key) == null)
        {
            throw new NullPointerException("Localization file is missing the key: locales." + locale + "." + key);
        }
        return ((Map)((Map) map.get("locales")).get(locale)).get(key);
    }

    public static Object getObject(String key, String key2)
    {
        if(((Map) getObject(key)).get(key2) == null)
        {
            throw new NullPointerException("Localization file is missing the key: locales." + locale + "." + key + "." + key2);
        }
        return ((Map) getObject(key)).get(key2);
    }

    public static Object getObject(String key, String key2, String key3)
    {
        if(((Map) getObject(key, key2)).get(key3) == null)
        {
            throw new NullPointerException("Localization file is missing the key: locales." + locale + "." + key + "." + key2 + "." + key3);
        }
        return ((Map) getObject(key, key2)).get(key3);
    }

    public static Object getObject(String key, String key2, String key3, String key4)
    {
        if(((Map) getObject(key, key2, key3)).get(key4) == null)
        {
            throw new NullPointerException("Localization file is missing the key: locales." + locale + "." + key + "." + key2 + "." + key3 + "." + key4);
        }
        return ((Map) getObject(key, key2, key3)).get(key4);
    }
}