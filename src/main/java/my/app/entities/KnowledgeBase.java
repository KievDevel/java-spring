package my.app.entities;


import javax.persistence.*;

@Entity
@Table
public class KnowledgeBase {

    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private String name;

    @Column
    private String header;

    @Column
    private String text;

    @Column
    private short type;

    public KnowledgeBase() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KnowledgeBase that = (KnowledgeBase) o;

        if (id != that.id) return false;
        if (type != that.type) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (header != null ? !header.equals(that.header) : that.header != null) return false;
        return text != null ? text.equals(that.text) : that.text == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (header != null ? header.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (int) type;
        return result;
    }

    @Override
    public String toString() {
        return "KnowledgeBase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", header='" + header + '\'' +
                ", text='" + text + '\'' +
                ", type=" + type +
                '}';
    }
}
