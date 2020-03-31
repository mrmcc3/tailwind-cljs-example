### Example Setup - Tailwind + ClojureScript

Some example setups for using TailwindCSS with ClojureScript.

Both examples (figwheel-main, shadow-cljs) rely on the official tailwind nodejs 
tooling to process the CSS. All the official docs regarding [configuration
](https://tailwindcss.com/docs/configuration)
apply here.

The examples follow the tailwind [recommendation](https://tailwindcss.com/docs/controlling-file-size#removing-unused-css)
for controlling css file size in production builds using PurgeCSS. One thing to
be aware of is that by default PurgeCSS works by running a regex over all
your source files to find anything that might be a CSS selector.

Out of the box it works on class names in cljs files that are strings or
symbols. It **does not work** on keyword class names.

Due to the way PurgeCSS works it can only eliminate classes it can see via its
regex. This means the tailwind classes need to be literal strings/symbols
(not generated). See [writing purgeable html](https://tailwindcss.com/docs/controlling-file-size#writing-purgeable-html)

