package kz.onday.tm.core.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "level", schema = "onday_core", catalog = "")
public class Level {
    private int id;
    private String name;
    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Level level = (Level) o;
        return id == level.id &&
                Objects.equals(name, level.name) &&
                Objects.equals(description, level.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }
}
