.class public final Le4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le4/a;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Le4/c;->a:I

    iput p2, p0, Le4/c;->b:I

    iput p3, p0, Le4/c;->c:I

    return-void
.end method


# virtual methods
.method public final getType()I
    .locals 1

    const v0, 0x68697661

    return v0
.end method
