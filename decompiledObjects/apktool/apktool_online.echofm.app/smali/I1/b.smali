.class public final synthetic LI1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Landroid/content/Context;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LI1/b;->o:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, LI1/b;->p:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LI1/b;->q:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LI1/b;->o:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LI1/b;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LI1/b;->q:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LI1/c;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
