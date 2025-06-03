.class public final synthetic LQ4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/i;


# instance fields
.field public final synthetic a:LQ4/e;

.field public final synthetic b:Z

.field public final synthetic c:Lcom/google/firebase/remoteconfig/internal/b;


# direct methods
.method public synthetic constructor <init>(LQ4/e;ZLcom/google/firebase/remoteconfig/internal/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ4/d;->a:LQ4/e;

    .line 5
    .line 6
    iput-boolean p2, p0, LQ4/d;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, LQ4/d;->c:Lcom/google/firebase/remoteconfig/internal/b;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LV2/j;
    .locals 3

    .line 1
    iget-object v0, p0, LQ4/d;->a:LQ4/e;

    .line 2
    .line 3
    iget-boolean v1, p0, LQ4/d;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, LQ4/d;->c:Lcom/google/firebase/remoteconfig/internal/b;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Void;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, p1}, LQ4/e;->a(LQ4/e;ZLcom/google/firebase/remoteconfig/internal/b;Ljava/lang/Void;)LV2/j;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
