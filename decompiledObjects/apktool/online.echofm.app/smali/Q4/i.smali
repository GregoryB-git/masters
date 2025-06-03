.class public final synthetic LQ4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/b;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/internal/c;

.field public final synthetic b:Ljava/util/Date;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/internal/c;Ljava/util/Date;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ4/i;->a:Lcom/google/firebase/remoteconfig/internal/c;

    .line 5
    .line 6
    iput-object p2, p0, LQ4/i;->b:Ljava/util/Date;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LV2/j;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LQ4/i;->a:Lcom/google/firebase/remoteconfig/internal/c;

    .line 2
    .line 3
    iget-object v1, p0, LQ4/i;->b:Ljava/util/Date;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/google/firebase/remoteconfig/internal/c;->c(Lcom/google/firebase/remoteconfig/internal/c;Ljava/util/Date;LV2/j;)LV2/j;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
