.class public final Lta/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/SharedPreferences;

.field public b:Z

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:I

.field public g:Ljava/lang/String;

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:I

.field public m:I

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "audio_service_preferences"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lta/a;->a:Landroid/content/SharedPreferences;

    const-string v0, "androidResumeOnClick"

    const/4 v2, 0x1

    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lta/a;->b:Z

    iget-object p1, p0, Lta/a;->a:Landroid/content/SharedPreferences;

    const-string v0, "androidNotificationChannelId"

    const/4 v3, 0x0

    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lta/a;->c:Ljava/lang/String;

    iget-object p1, p0, Lta/a;->a:Landroid/content/SharedPreferences;

    const-string v0, "androidNotificationChannelName"

    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lta/a;->d:Ljava/lang/String;

    iget-object p1, p0, Lta/a;->a:Landroid/content/SharedPreferences;

    const-string v0, "androidNotificationChannelDescription"

    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lta/a;->e:Ljava/lang/String;

    iget-object p1, p0, Lta/a;->a:Landroid/content/SharedPreferences;

    const-string v0, "notificationColor"

    const/4 v4, -0x1

    invoke-interface {p1, v0, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lta/a;->f:I

    iget-object p1, p0, Lta/a;->a:Landroid/content/SharedPreferences;

    const-string v0, "androidNotificationIcon"

    const-string v5, "mipmap/ic_launcher"

    invoke-interface {p1, v0, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lta/a;->g:Ljava/lang/String;

    iget-object p1, p0, Lta/a;->a:Landroid/content/SharedPreferences;

    const-string v0, "androidShowNotificationBadge"

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lta/a;->h:Z

    iget-object p1, p0, Lta/a;->a:Landroid/content/SharedPreferences;

    const-string v0, "androidNotificationClickStartsActivity"

    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lta/a;->i:Z

    iget-object p1, p0, Lta/a;->a:Landroid/content/SharedPreferences;

    const-string v0, "androidNotificationOngoing"

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lta/a;->j:Z

    iget-object p1, p0, Lta/a;->a:Landroid/content/SharedPreferences;

    const-string v0, "androidStopForegroundOnPause"

    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lta/a;->k:Z

    iget-object p1, p0, Lta/a;->a:Landroid/content/SharedPreferences;

    const-string v0, "artDownscaleWidth"

    invoke-interface {p1, v0, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lta/a;->l:I

    iget-object p1, p0, Lta/a;->a:Landroid/content/SharedPreferences;

    const-string v0, "artDownscaleHeight"

    invoke-interface {p1, v0, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lta/a;->m:I

    iget-object p1, p0, Lta/a;->a:Landroid/content/SharedPreferences;

    const-string v0, "activityClassName"

    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lta/a;->n:Ljava/lang/String;

    iget-object p1, p0, Lta/a;->a:Landroid/content/SharedPreferences;

    const-string v0, "androidBrowsableRootExtras"

    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lta/a;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lta/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-boolean v1, p0, Lta/a;->b:Z

    const-string v2, "androidResumeOnClick"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lta/a;->c:Ljava/lang/String;

    const-string v2, "androidNotificationChannelId"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lta/a;->d:Ljava/lang/String;

    const-string v2, "androidNotificationChannelName"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lta/a;->e:Ljava/lang/String;

    const-string v2, "androidNotificationChannelDescription"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget v1, p0, Lta/a;->f:I

    const-string v2, "notificationColor"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lta/a;->g:Ljava/lang/String;

    const-string v2, "androidNotificationIcon"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-boolean v1, p0, Lta/a;->h:Z

    const-string v2, "androidShowNotificationBadge"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-boolean v1, p0, Lta/a;->i:Z

    const-string v2, "androidNotificationClickStartsActivity"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-boolean v1, p0, Lta/a;->j:Z

    const-string v2, "androidNotificationOngoing"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-boolean v1, p0, Lta/a;->k:Z

    const-string v2, "androidStopForegroundOnPause"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget v1, p0, Lta/a;->l:I

    const-string v2, "artDownscaleWidth"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget v1, p0, Lta/a;->m:I

    const-string v2, "artDownscaleHeight"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lta/a;->n:Ljava/lang/String;

    const-string v2, "activityClassName"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lta/a;->o:Ljava/lang/String;

    const-string v2, "androidBrowsableRootExtras"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
