module.exports = {
  content: ["src/**/*.cljs"],
  css: ["public/out/app.css"],
  defaultExtractor: (content) => content.match(/[\w-/.:]+(?<!:)/g) || [],
};
