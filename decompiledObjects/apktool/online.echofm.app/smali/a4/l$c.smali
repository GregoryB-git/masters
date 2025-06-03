.class public La4/l$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:La4/k;

.field public final b:Ljava/util/List;


# direct methods
.method public constructor <init>(La4/k;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La4/l$c;->a:La4/k;

    .line 5
    .line 6
    iput-object p2, p0, La4/l$c;->b:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method
