.class public final synthetic Ly1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Landroid/content/Context;

.field public final synthetic p:Ly1/s;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ly1/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/r;->o:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Ly1/r;->p:Ly1/s;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/r;->o:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/r;->p:Ly1/s;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ly1/s$a;->a(Landroid/content/Context;Ly1/s;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
