#!/usr/bin/env bash
set -e

# cleanup output dir
rm -rf resources/public/out

# generate full tailwind css
yarn tailwind-css

# purge unused css
yarn purge-css

# minify css
yarn clean-css

# build cljs in advanced mode
clojure -m figwheel.main -O advanced -bo app

# cleanup cljs-runtime (not required)
rm -rf resources/public/out/cljs-runtime
