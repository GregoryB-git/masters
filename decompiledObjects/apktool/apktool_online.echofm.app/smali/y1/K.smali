.class public final synthetic Ly1/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/K;->o:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ly1/K;->p:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/K;->o:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/K;->p:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ly1/L;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
