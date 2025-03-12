from django.urls import path
from . import views
from django.conf import settings
from django.conf.urls.static import static

urlpatterns = [
    path('', views.upload_excel, name='upload_excel'),  # Set the root URL to the upload view
    path('student-count/', views.student_count, name='student_count'),
    path('upload/', views.upload_excel, name='upload_excel'),
    path('upload/success/', views.upload_success, name='upload_success'),
    path('instruction/', views.instruction_view, name='instruction'),
]

# Serve media files during development (only in DEBUG mode)
if settings.DEBUG:
    urlpatterns += static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)