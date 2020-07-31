package com.tmoney.utils;


import org.junit.jupiter.api.Test;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class YamlRead {
    InputStream in;
   @Test
   public void testYaml()  {
       Yaml yaml = new Yaml();
       try {
           in = YamlRead.class.getClassLoader().getResourceAsStream("testYaml.yml");
           Map map = (Map) yaml.load(in);
           System.out.println(map);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

}




