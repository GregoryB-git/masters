.class public final synthetic LQ4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/b;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/internal/e;

.field public final synthetic b:LV2/j;

.field public final synthetic c:LV2/j;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/internal/e;LV2/j;LV2/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ4/o;->a:Lcom/google/firebase/remoteconfig/internal/e;

    .line 5
    .line 6
    iput-object p2, p0, LQ4/o;->b:LV2/j;

    .line 7
    .line 8
    iput-object p3, p0, LQ4/o;->c:LV2/j;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(LV2/j;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LQ4/o;->a:Lcom/google/firebase/remoteconfig/internal/e;

    .line 2
    .line 3
    iget-object v1, p0, LQ4/o;->b:LV2/j;

    .line 4
    .line 5
    iget-object v2, p0, LQ4/o;->c:LV2/j;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, Lcom/google/firebase/remoteconfig/internal/e;->b(Lcom/google/firebase/remoteconfig/internal/e;LV2/j;LV2/j;LV2/j;)LV2/j;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
