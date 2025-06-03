.class public LB6/f$a;
.super LB6/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB6/f;->b(LB6/d;[BII)LB6/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:[B

.field public final synthetic c:I


# direct methods
.method public constructor <init>(LB6/d;I[BI)V
    .locals 0

    .line 1
    iput p2, p0, LB6/f$a;->a:I

    .line 2
    .line 3
    iput-object p3, p0, LB6/f$a;->b:[B

    .line 4
    .line 5
    iput p4, p0, LB6/f$a;->c:I

    .line 6
    .line 7
    invoke-direct {p0}, LB6/f;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
