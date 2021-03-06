{
 :title "{{ post.title }}"
 :category "{{ post.category }}"
 :tags [{% for tag in post.tags %}"{{ tag }}"{% endfor %}]
 :href "{{ post.url }}"
 :date {
    :day "{{ post.date | date: "%d" }}"
    :month "{{ post.date | date: "%B" }}"
    :year "{{ post.date | date: "%Y" }}"
  }
}