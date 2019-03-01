(ns secondppm.core)



(def  head (str "P3\n" 400" " 600 "\n255\n"))

  (def foo
    (let [
        
          matrix   (clojure.string/join (for [j (range  600) 
                                              i (range 0 400)
                                              :let  [r (mod i 255)
                                                     g (mod j 255)
                                                     b (/(* i j)255)
                                                     ]
                                              ]
                                           (str r " " g " " b "\n")))]
    (spit "test2.ppm" head )
    (spit "test2.ppm" matrix)))


