.class public LH3/n$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH3/n;->f(Ljava/util/concurrent/Callable;)LV2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Callable;

.field public final synthetic b:LH3/n;


# direct methods
.method public constructor <init>(LH3/n;Ljava/util/concurrent/Callable;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH3/n$c;->b:LH3/n;

    .line 2
    .line 3
    iput-object p2, p0, LH3/n$c;->a:Ljava/util/concurrent/Callable;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LV2/j;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, LH3/n$c;->a:Ljava/util/concurrent/Callable;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
