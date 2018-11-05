package cn.itcast.domain;

public class Kind {

    private Integer id;
    private String kind_name;



    @Override
    public String toString() {

        return "Kind{" +
                "id=" + id +
                ", kind_name='" + kind_name + '\'' +
                '}';
    }



    public Integer getId() {

        return id;
    }



    public void setId(Integer id) {

        this.id = id;
    }



    public String getKind_name() {

        return kind_name;
    }



    public void setKind_name(String kind_name) {

        this.kind_name = kind_name;
    }
}
