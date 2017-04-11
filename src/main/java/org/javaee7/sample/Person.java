package org.javaee7.sample;

import javax.xml.bind.annotation.XmlRootElement;

/** Représente une personne avec un id et un nom
 * @author arungupta
 */
@XmlRootElement
public class Person {
    private int id;
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}