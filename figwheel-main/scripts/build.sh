#!/usr/bin/env bash
set -e

# cleanup output dir
rm -rf resources/public/out

# generate full tailwind css
NODE_ENV=production npx tailwind build src/tailwind/example/app.css --output resources/public/out/app.css

# minify css
npx cleancss -o resources/public/out/app.css resources/public/out/app.css

# build cljs in advanced mode
clojure -m figwheel.main -O advanced -bo app

# cleanup cljs-runtime (not required)
rm -rf resources/public/out/cljs-runtime
