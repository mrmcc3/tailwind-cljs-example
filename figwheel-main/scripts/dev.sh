#!/usr/bin/env bash
set -e

# cleanup output dir
rm -rf resources/public/out

# generate full tailwind css
yarn tailwind-css

# start figwheel
clojure -m figwheel.main -b app
