.class public final Le7/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public c:Z

.field public d:Z

.field public final synthetic e:Le7/l1;


# direct methods
.method public constructor <init>(Le7/l1;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Le7/o1;->e:Le7/l1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    iput-object p2, p0, Le7/o1;->a:Ljava/lang/String;

    iput-boolean p3, p0, Le7/o1;->b:Z

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    iget-object v0, p0, Le7/o1;->e:Le7/l1;

    invoke-virtual {v0}, Le7/l1;->v()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Le7/o1;->a:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    iput-boolean p1, p0, Le7/o1;->d:Z

    return-void
.end method

.method public final b()Z
    .locals 3

    iget-boolean v0, p0, Le7/o1;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Le7/o1;->c:Z

    iget-object v0, p0, Le7/o1;->e:Le7/l1;

    invoke-virtual {v0}, Le7/l1;->v()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Le7/o1;->a:Ljava/lang/String;

    iget-boolean v2, p0, Le7/o1;->b:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Le7/o1;->d:Z

    :cond_0
    iget-boolean v0, p0, Le7/o1;->d:Z

    return v0
.end method
