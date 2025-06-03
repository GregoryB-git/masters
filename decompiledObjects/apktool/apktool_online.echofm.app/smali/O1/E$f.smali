.class public final LO1/E$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO1/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO1/E$f$a;
    }
.end annotation


# static fields
.field public static final c:LO1/E$f$a;


# instance fields
.field public a:LO1/E$e;

.field public b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LO1/E$f$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LO1/E$f$a;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LO1/E$f;->c:LO1/E$f$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LO1/E$f;-><init>()V

    return-void
.end method

.method public static final synthetic a(LO1/E$f;LO1/E$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO1/E$f;->a:LO1/E$e;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic b(LO1/E$f;I)V
    .locals 0

    .line 1
    iput p1, p0, LO1/E$f;->b:I

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, LO1/E$f;->b:I

    .line 2
    .line 3
    return v0
.end method
