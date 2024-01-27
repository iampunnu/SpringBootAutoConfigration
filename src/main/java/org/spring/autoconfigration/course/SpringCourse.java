package org.spring.autoconfigration.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class SpringCourse {
    @Autowired
    public AuthorName authorName;
    public String name;
    public String varseion;

    public AuthorName getAuthorName() {
        return authorName;
    }

    public void setAuthorName(AuthorName authorName) {
        this.authorName = authorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVarseion() {
        return varseion;
    }

    public void setVarseion(String varseion) {
        this.varseion = varseion;
    }
}
