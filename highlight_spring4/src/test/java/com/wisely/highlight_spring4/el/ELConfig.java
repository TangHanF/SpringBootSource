package com.wisely.highlight_spring4.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Title: <br>
 * Packet:com.wisely.highlight_spring4.el<br>
 * Description: <br>
 * Author:GuoFu<br>
 * Create Date: 2018/6/12.<br>
 * Modify User: <br>
 * Modify Date: <br>
 * Modify Description: <br>
 */
@Component
@ComponentScan("com.wisely.highlight_spring4.el")
@PropertySource("classpath:com/wisely/highlight_spring4/el/test.properties")
public class ELConfig {
    //注入字符串
    @Value("注入普通字符串.......")
    private String normalString;

    //注入系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{systemProperties['os.version']}")
    private String osVersion;

    //注入表达式结果
    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNumber;

    //注入其它Bean属性
    @Value("#{demoService.age}") //4 注入其它Bean属性
    private String fromAnother;

    //注入文件资源
    @Value("classpath:com/wisely/highlight_spring4/el/test.txt")
    private Resource testFile;

    //注入网址资源
    @Value("http://www.baidu.com")
    private Resource testUrl;


    //注入配置文件。需要配置一个 PropertySourcesPlaceholderConfigurer 的Bean
    @Value("${book.name}")
    private String bookName;

    //@Autowired
    //private Environment environment;

    @Bean //7
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }



    public String getNormalString() {
        return normalString;
    }

    public void setNormalString(String normalString) {
        this.normalString = normalString;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public double getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(double randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String getFromAnother() {
        return fromAnother;
    }

    public void setFromAnother(String fromAnother) {
        this.fromAnother = fromAnother;
    }

    public Resource getTestFile() {
        return testFile;
    }

    public void setTestFile(Resource testFile) {
        this.testFile = testFile;
    }

    public String getTestUrl(String character) throws IOException {
        return IOUtils.toString(testUrl.getInputStream(),Charset.forName(character));
    }

    public void setTestUrl(Resource testUrl) {
        this.testUrl = testUrl;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    //public Environment getEnvironment() {
    //    return environment;
    //}
    //
    //public void setEnvironment(Environment environment) {
    //    this.environment = environment;
    //}
}
