package com.lm;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Leaves on 2016/12/7.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(Reader reader);

}
