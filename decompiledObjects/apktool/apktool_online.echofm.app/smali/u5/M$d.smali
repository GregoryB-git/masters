.class public Lu5/M$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu5/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:I

.field public final b:[Lu5/M$c;


# direct methods
.method public constructor <init>(I[Lu5/M$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lu5/M$d;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lu5/M$d;->b:[Lu5/M$c;

    .line 7
    .line 8
    return-void
.end method
