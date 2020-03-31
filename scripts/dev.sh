#!/usr/bin/env bash
set -e
yarn tailwind-css
clojure -m figwheel.main -b app
