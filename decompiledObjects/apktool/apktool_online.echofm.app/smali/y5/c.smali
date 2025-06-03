.class public final synthetic Ly5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ly5/f;

.field public final synthetic p:Landroid/content/Context;

.field public final synthetic q:[Ljava/lang/String;

.field public final synthetic r:Landroid/os/Handler;

.field public final synthetic s:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ly5/f;Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly5/c;->o:Ly5/f;

    .line 5
    .line 6
    iput-object p2, p0, Ly5/c;->p:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Ly5/c;->q:[Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Ly5/c;->r:Landroid/os/Handler;

    .line 11
    .line 12
    iput-object p5, p0, Ly5/c;->s:Ljava/lang/Runnable;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Ly5/c;->o:Ly5/f;

    .line 2
    .line 3
    iget-object v1, p0, Ly5/c;->p:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Ly5/c;->q:[Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Ly5/c;->r:Landroid/os/Handler;

    .line 8
    .line 9
    iget-object v4, p0, Ly5/c;->s:Ljava/lang/Runnable;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, Ly5/f;->b(Ly5/f;Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
