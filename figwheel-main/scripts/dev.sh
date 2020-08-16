#!/usr/bin/env bash
set -e

# cleanup output dir
rm -rf resources/public/out

# generate full tailwind css
npx tailwind build src/tailwind/example/app.css --output resources/public/out/app.css

# start figwheel
clojure -m figwheel.main -b app
