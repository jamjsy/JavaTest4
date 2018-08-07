package com.hand;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import com.hand.domain.entity.Actor;
import com.hand.domain.entity.Film;
import com.hand.domain.entity.GetEnv;
import com.hand.infra.mapper.FilmMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Reader reader=null;
        SqlSession session;
        try {
            reader= Resources.getResourceAsReader(mybatisResource);

        }catch (IOException ioe){
            System.out.println(ioe);
        }
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
        public void create(Int film_id,String title,Int language_id,String description) {
            String SQL = "insert into Film (film_id,title,language_id,description) values (200,xxxxx , 1 ,xxxxxxxxxxxx)";
            jdbcTemplateObject.update( SQL, film_id, title,language_id,description);
            System.out.println("film_id = " + film_id + " title = " + title + " language_id +" + language_id + " description= " + description);
            return;

            public Film getFilm_id(Integer id) {
                String SQL = "select * from Film where id =200";
                Student student = jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new StudentMapper());
                return student;
            }

            }

            public void update(Integer id, Integer age){
                String SQL = "update Film set id = 200 where id = 1";
                Application.update(SQL, id);
                System.out.println("Updated Record with ID = " + id );
                return;
            }
        }



        FilmMapper filmmapper = session.getMapper(FilmMapper.class);
        Film film = filmmapper.findByName("Context Start");
        System.out.println(film.film_id+" ");
        System.out.println(film.title);
        System.out.println(film.language_id);
        System.out.println(film.description);


        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        GetEnv env=(GetEnv) context.getBean("env");
        System.out.println("mysqlip:"+env.mysqlip);
        System.out.println("mysqlpassword:"+env.musqlpassword);
        System.out.println("mysqlpassword:"+env.port);

    }
}
