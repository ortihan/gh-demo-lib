package com.ag04.utils;

/**
 *
 * @author tihanaoremus
 * */
public interface DummyService {
    
    DummyDTO get(Long id);

    DummyDTO save(DummyDTO testDto);
}
