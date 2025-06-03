.class public Lq3/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/i$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq3/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Lq3/j;


# direct methods
.method public constructor <init>(Lq3/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/i$c;->a:Lq3/j;

    return-void
.end method

.method public synthetic constructor <init>(Lq3/j;Lq3/i$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lq3/i$c;-><init>(Lq3/j;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lq3/i$c;->a:Lq3/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, p1, v1}, Lq3/j;->a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method
