package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Сущность Пользователь
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column
    public int id;

    @Column(name = "name")
    public String name;
}
