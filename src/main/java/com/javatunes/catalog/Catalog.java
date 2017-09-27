/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-12 LearningPatterns Inc.
 */

package com.javatunes.catalog;

import com.javatunes.catalog.persist.MusicItem;

public interface Catalog {

   public MusicItem findById(Long id);

}
