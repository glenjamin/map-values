# map-values

A one-function clojure lib that provides (map-values).

[![Build Status](https://travis-ci.org/glenjamin/map-values.png?branch=master)](https://travis-ci.org/glenjamin/map-values)

## Dependency Information

[![Clojars Project](http://clojars.org/map-values/latest-version.svg)](http://clojars.org/map-values)

The latest version and information on how to install it is available from [clojars](http://clojars.org/map-values).

## Usage

```clj
(ns example
  (:require [handy.map-values :refer [map-values]]))

(map-values inc {:a 1 :b 2 :c 3})
; => {:a 2 :b 3 :c 4}
```

## License

Copyright © 2015 Glen Mailer

Distributed under the MIT License.
