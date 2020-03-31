#!/usr/bin/env bash
set -e
yarn tailwind-css
yarn purge-css
yarn clean-css
clojure -m figwheel.main -O advanced -bo app
rm -rf resources/public/cljs-runtime
