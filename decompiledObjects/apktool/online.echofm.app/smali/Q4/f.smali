.class public final synthetic LQ4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/b;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/internal/c;

.field public final synthetic b:J

.field public final synthetic c:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/internal/c;JLjava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ4/f;->a:Lcom/google/firebase/remoteconfig/internal/c;

    .line 5
    .line 6
    iput-wide p2, p0, LQ4/f;->b:J

    .line 7
    .line 8
    iput-object p4, p0, LQ4/f;->c:Ljava/util/Map;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(LV2/j;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LQ4/f;->a:Lcom/google/firebase/remoteconfig/internal/c;

    .line 2
    .line 3
    iget-wide v1, p0, LQ4/f;->b:J

    .line 4
    .line 5
    iget-object v3, p0, LQ4/f;->c:Ljava/util/Map;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3, p1}, Lcom/google/firebase/remoteconfig/internal/c;->e(Lcom/google/firebase/remoteconfig/internal/c;JLjava/util/Map;LV2/j;)LV2/j;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
