package com.rufstech.mycash.web.api;

import com.rufstech.mycash.domain.Entry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/entry")
public class EntryController {

    @GetMapping
    public List<Entry> all(){
        return Collections.EMPTY_LIST;
    }

}
