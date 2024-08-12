package com.test.service;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class GenerationService {
    BigUniqueRng b;
    LinkedHashSet<String> set;
    public GenerationService(){
        b = new BigUniqueRng(100000,100000);
        set = b.generated;
    }
    public String generateNumber(){
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        Iterator<String> iterator = set.iterator();
        if (!iterator.hasNext()){
            b = new BigUniqueRng(100000,100000);
            set = b.generated;
            iterator = set.iterator();
        }
        String next = iterator.next();
        iterator.remove();
        return next + date;
    }
}

class BigUniqueRng {
    private Random random = new Random();
    public LinkedHashSet<String> generated = new LinkedHashSet<>();

    public BigUniqueRng(int size, int max) {
        while (generated.size() < size) {
            int next = random.nextInt(max);
            String nextStr = String.format("%05d", next);
            generated.add(nextStr);
        }
    }
}
