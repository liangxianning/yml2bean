package vip.liangxn.yml2bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author xn
 * 2018/9/29 19:17
 */
@Component
@ConfigurationProperties(prefix = "person")
public class PersonBean {
    private String name;
    private int age;
    private Map<String, String> play;
    private List<String> hobby;
    private List<String> study;
    private Map<String, Map<String, Object>> family;
    private List<List<String>> nodes1;
    private Map<String, List<Object>> nodes2;
    private List<Map<String, Object>> node3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, String> getPlay() {
        return play;
    }

    public void setPlay(Map<String, String> play) {
        this.play = play;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public List<String> getStudy() {
        return study;
    }

    public void setStudy(List<String> study) {
        this.study = study;
    }

    public Map<String, Map<String, Object>> getFamily() {
        return family;
    }

    public void setFamily(Map<String, Map<String, Object>> family) {
        this.family = family;
    }

    public List<List<String>> getNodes1() {
        return nodes1;
    }

    public void setNodes1(List<List<String>> nodes1) {
        this.nodes1 = nodes1;
    }

    public Map<String, List<Object>> getNodes2() {
        return nodes2;
    }

    public void setNodes2(Map<String, List<Object>> nodes2) {
        this.nodes2 = nodes2;
    }

    public List<Map<String, Object>> getNode3() {
        return node3;
    }

    public void setNode3(List<Map<String, Object>> node3) {
        this.node3 = node3;
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", play=" + play +
                ", hobby=" + hobby +
                ", study=" + study +
                ", family=" + family +
                ", nodes1=" + nodes1 +
                ", nodes2=" + nodes2 +
                ", node3=" + node3 +
                '}';
    }
}
