package com.example.EasyBlog.Service;

import com.example.EasyBlog.Repositories.ArticlesReadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticlesReadService {
    @Autowired
    private static ArticlesReadRepository articlesReadRepository;
}