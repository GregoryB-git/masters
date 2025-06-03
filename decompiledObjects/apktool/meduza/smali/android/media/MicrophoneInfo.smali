.class public final synthetic Landroid/media/MicrophoneInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V

    throw v0
.end method


# virtual methods
.method public native synthetic getAddress()Ljava/lang/String;
    .annotation build Landroid/annotation/NonNull;
    .end annotation
.end method

.method public native synthetic getChannelMapping()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end method

.method public native synthetic getDescription()Ljava/lang/String;
.end method

.method public native synthetic getDirectionality()I
.end method

.method public native synthetic getFrequencyResponse()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end method

.method public native synthetic getGroup()I
.end method

.method public native synthetic getId()I
.end method

.method public native synthetic getIndexInTheGroup()I
.end method

.method public native synthetic getLocation()I
.end method

.method public native synthetic getMaxSpl()F
.end method

.method public native synthetic getMinSpl()F
.end method

.method public native synthetic getOrientation()Landroid/media/MicrophoneInfo$Coordinate3F;
.end method

.method public native synthetic getPosition()Landroid/media/MicrophoneInfo$Coordinate3F;
.end method

.method public native synthetic getSensitivity()F
.end method

.method public native synthetic getType()I
.end method
