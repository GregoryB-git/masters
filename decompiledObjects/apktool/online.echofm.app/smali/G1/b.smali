.class public final synthetic LG1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:J

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, LG1/b;->o:J

    .line 5
    .line 6
    iput-object p3, p0, LG1/b;->p:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, LG1/b;->q:Landroid/content/Context;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-wide v0, p0, LG1/b;->o:J

    .line 2
    .line 3
    iget-object v2, p0, LG1/b;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v3, p0, LG1/b;->q:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, LG1/f;->a(JLjava/lang/String;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
