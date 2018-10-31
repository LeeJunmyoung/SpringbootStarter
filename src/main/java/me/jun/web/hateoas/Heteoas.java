package me.jun.web.hateoas;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Heteoas {

    @JsonProperty
    private String prefix;

    @JsonProperty
    private String name;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Heteoas{" +
                "prefix='" + prefix + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
